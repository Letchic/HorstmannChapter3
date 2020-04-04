package com.letchic.sequence;

public interface IntSequence {
     boolean hasNext();
    int next();

        static IntSequence of(int... list) {
            return new IntSequence() {
                private int pos = 0;
                public boolean hasNext() {
                    return pos < list.length;
                }
                public int next() {
                    return hasNext() ? list[pos++] : 0;
                }
            };
        }

        static IntSequence constant(int n) {
            return new IntSequence() {
                @Override
                public boolean hasNext() {
                    return true;
                }
                @Override
                public int next() {
                    return n;
                }
            };
        }

}

