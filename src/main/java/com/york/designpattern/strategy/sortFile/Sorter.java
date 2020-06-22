package com.york.designpattern.strategy.sortFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author york
 * @create 2020-06-22 15:53
 **/
public class Sorter {

    private static final long GB = 1000 * 1000 * 1000;

    private static List<AlgRange> algRanges = new ArrayList<>();

    static {
        algRanges.add(new AlgRange(0,6 * GB,new QuickSort()));
        algRanges.add(new AlgRange(6 * GB,10 * GB,new QuickSort()));
        algRanges.add(new AlgRange(10 * GB,100 * GB,new QuickSort()));
        algRanges.add(new AlgRange(100 * GB,Long.MAX_VALUE,new QuickSort()));
    }
    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg;

        if (fileSize < 6 * GB) {
            sortAlg = new QuickSort();
        } else if (fileSize < 10 * GB) {
            sortAlg = new ExternalSort();
        } else if (fileSize < 100 * GB) {
            sortAlg = new ConcurrentExternalSort();
        } else {
            sortAlg = new MapReduceSort();
        }
        // 去除if-else 判断逻辑
        for (AlgRange algRange : algRanges) {
            if (algRange.inRange(fileSize)) {
                sortAlg = algRange.getSortAlg();
                break;
            }
        }

        sortAlg.sort(filePath);
    }

    private static class AlgRange {
        private long start;

        private long end;

        private ISortAlg sortAlg;

        public AlgRange(long start,long end,ISortAlg sortAlg) {
            this.start = start;
            this.end = end;
            this.sortAlg = sortAlg;
        }

        public long getStart() {
            return start;
        }

        public long getEnd() {
            return end;
        }

        public ISortAlg getSortAlg() {
            return sortAlg;
        }

        public boolean inRange(long size) {
            if (start <= size && end > size) {
                return true;
            }
            return false;
        }
    }
}
