class GridIllumination {
    public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
        Map<Pair, Integer> lampStates = new HashMap<>();
        Map<Integer, Set<Pair>> lampsByRow = new HashMap<>();
        Map<Integer, Set<Pair>> lampsByCol = new HashMap<>();
        Map<Pair, Set<Pair>> leftDiagonal = new HashMap<>();
        Map<Pair, Set<Pair>> rightDiagonal = new HashMap<>();
        
        
        for (int index = 0; index < lamps.length; index++) {
            int row = lamps[index][0];
            int col = lamps[index][1];
            Pair lamp = new Pair(row, col);
            lampStates.put(new Pair(row, col), 1);
            if (!lampsByRow.containsKey(row)) {
                lampsByRow.put(row, new HashSet<>());
            }
            if (!lampsByCol.containsKey(col)) {
                lampsByCol.put(col, new HashSet<>());
            }
            
            Pair leftStart = getLeftStart(row, col, N);
            Pair rightStart = getRightStart(row, col, N);

            
            if (!leftDiagonal.containsKey(leftStart)) {
                leftDiagonal.put(leftStart, new HashSet<>());
            }
            
            if (!rightDiagonal.containsKey(rightStart)) {
                rightDiagonal.put(rightStart, new HashSet<>());
            }
            
            lampsByRow.get(row).add(lamp);
            lampsByCol.get(col).add(lamp);
            leftDiagonal.get(leftStart).add(lamp);
            rightDiagonal.get(rightStart).add(lamp);

        }
        
        int[] answers = new int[queries.length];
        int i = 0;
        for (int[] q : queries) {
            int r = q[0];
            int c = q[1];
            Pair cell = new Pair(r, c);
            int isLit = 0;
            Pair leftStart = getLeftStart(r,c,N);
            Pair rightStart = getRightStart(r,c,N);

            
            if (lampsByRow.containsKey(r)) {
                for (Pair lamp : lampsByRow.get(r)) {
                    if (lampStates.get(lamp) == 1) {
                        isLit = 1;
                        break;
                    }
                }
            } 
            if (lampsByCol.containsKey(c)) {
                for (Pair lamp : lampsByCol.get(c)) {
                    if (lampStates.get(lamp) == 1) {
                        isLit = 1;
                        break;
                    }
                }
            } 
            if (leftDiagonal.containsKey(leftStart)) {
                for (Pair lamp : leftDiagonal.get(leftStart)) {
                    if (lampStates.get(lamp) == 1) {
                        isLit = 1;
                        break;
                    }
                }
            } 
            
            if (rightDiagonal.containsKey(rightStart)) {
                for (Pair lamp : rightDiagonal.get(rightStart)) {
                    if (lampStates.get(lamp) == 1) {
                        isLit = 1;
                        break;
                    }
                }
            }
            
            answers[i++] = isLit;
            //if (isLit == 0) {
                //System.out.println(cell + " -> " + leftDiagonal.get(leftStart));
            //}
            
            for (int diffx = -1; diffx <= 1; diffx++) {
                for (int diffy = -1; diffy <= 1; diffy++) {
                    Pair p = new Pair(r + diffx, c+diffy);
                    if (lampStates.containsKey(p)) {
                        lampStates.put(p, 0);
                    }
                }
            }
           // if (isLit == 0) {
               // System.out.println(cell +"->" + illuminatedBy.get(cell));
            //}
        }
        
       
        
        return answers;
    }
    
    private Pair getLeftStart(int row, int col, int N) {
        if (row >= col) return new Pair(row - col, 0);
        return new Pair(0, col - row);
    }
    
    private Pair getRightStart(int row, int col, int N) {
        int diff = N - 1 - col;
        if (row >= diff) {
            return new Pair(row - diff, N-1);
        } else {
            return new Pair(0, col+row);
        }
    }
}


public class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair pair = (Pair) o;
        return x == pair.x &&
                y == pair.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    
    
    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}