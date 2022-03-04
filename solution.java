public class Solution {
  
  // use this method as a prototype for your answers...
  void soln1() {
    for (int i = 100; i >= 5; i—=5){
      System.out.println(i);
    }
  }
  
  void soln2() {
    for (int i = 100; i >= 5; i—=5){

    }
  }
  
  void soln3() {
    int sum=0;
    for (int i=9;i<=17;i++){
      sum+=i;
    }
    System.out.println(sum);
  }
  
  void soln4() {
    int smallest = 0;
    for(int i =0; i < a.length - 1; i++){
      if (a[i] < a[i + 1]){
        smallest = a[i];
      }
    }
    System.out.println(smallest);
  }
  
  void soln5() {
    int largest = a[0];
    for (int i = 1; i<a.length - 1; i++) {
      if (a[i] > largest){
        largest = a[i];
      }
    }
    System.out.println(largest);
  }

  
  void soln6() {
    for (int i = 0; i < a.length; i++){
      if (a[i] == true){
        break;
      }
    }
    System.out.println(i);
  }
  
  void soln7() {
  int i = 0;
    while (a[i] == false) {
      i++;
    }
    System.out.println(i);
  }

  
  void soln8() {
    for (int i =0; i < a.length; i++) {
      a[i] = a[i] +5;
          }
  }

  void soln9() {
    for (int i=0;i<a.length;i++) {
      a[i]=a[i]/1.3;
    }
  }
  void soln10() {
    for (int i =0; i < a.length; i++) {
      Math.pow(a[i], 3) - a[i]/ 3)
          }
  }
  
  void soln11() {
   for (int row = 0; row < array.length; row++){
    for ( int column = 0; column < array[i].length); column++){
      array[row][column]=0
            }
  }
        }
  void soln12() {
      for (int row = 0; row < array.length; row++){
        for ( int column = 0; column < array[i].length); column++){
        array[row][column] *= 7;
        }
  }
        }
  void soln13() {
    boolean [][] result = new boolean[array.length][array[0].length];
      for (int row = 0; row < array.length; row++){
        for ( int column = 0; column < array[i].length); column++){
          if ( [] %2 ==0){
            result[i][j] = true;
            return result;
            }
        }
   }
  }

  Double soln14(){
        return Math.pow(firstPerm,secondPerm);
        }
  
  boolean soln15() {
          return Object instanceof Fish;
  }
  
  void soln16() {
    if ( balance call <= 1.0){
      System.out.println("Paid Off");
          } else {
      System.out.println(String.format("%.2f", balance));
          }
  }
  void soln17(){
    While(true){
        if(temp>76){
          method.acOn
        } else if(temp<72){method.headOn}
    }
  }
  void soln18() {
    double pi = Math.PI;
    for (int i = 0; i<a.length; i++) {
      if (a[i] > pi){
        System.out.println(a[i] + " at index" + i);
        break;
      }
    }
  }
  
  void soln19(){
    for(int i=0;i<a.length;i++) {
      if (array[i] != null) {
        sum += i;
      }
    }
        return sum;
  }
  void soln20() {
   String[] reverse = new String[array.length];
   for (int i = 0; i <= array.length/2 ; i++) {
     reverse[i] = array[array.length - i - 1] = array[i];
        }
   return reverse;
  }
  
  String soln21() {
    String table = "";
      for (int i = 0; i < 6; i++){
        for (int j = 0; i < 6; j++){
          table = i*j;
        } table += "\n";
      } return table;
  }
  Double soln22() {
    return Math.pow(9, 2.0) + math.pow(7, 2.0);
  }
}