class SelfDividingNumber {

     public boolean checkNumber (int num, int orig) {
          if ((num % 10) == 0 || orig%(num % 10) != 0)  return false;
          if (num<10) return true;
          return checkNumber(num/10, orig);
      }

      public List<Integer> selfDividingNumbers(int left, int right) {
          List<Integer> result = new ArrayList<Integer> ();
          for (int i=left; i<= right; i++) {
              if (checkNumber(i, i)) {
                  result.add(i);
              }
          }     
          return result;    
       }
 }