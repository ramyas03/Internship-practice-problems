package arrays;

public class IntersectionUnionSortedArrays {

   public static void main(String[] args) {
      int b[] = { 1, 1, 2, 2, 3, 5, 9, 9, 10, 11, 12 };
      int a[] = { 1, 6, 9, 11 };

      int n1 = a.length;
      int n2 = b.length;
      int n = (n1 < n2) ? n1 : n2;

      int[] un = new int[n1 + n2];
      int[] in = new int[n];

      int count_in = 0;

      int j = 0;

      for (int i = 0; i < n1; i++) {
         while (j < n2) {
            if (a[i] < b[j])
               break;

            if (a[i] == b[j]) {
               if (count_in != 0 && in[count_in - 1] == a[i])
                  break;

               in[count_in++] = a[i];
               // System.out.println(" added to intersection ");

            }
            j++;
         }
      }

      for (int k = 0; k <= count_in - 1; k++)
         System.out.print(in[k] + ", ");

      if (count_in == 0)
         System.out.println("no intersection");

      int count_un = 0;
      int i = 0;
      j = 0;
      un[count_un] = a[0];

      while (i < n1 && j < n2) {
         if (a[i] == b[j]) {
            if (a[i] == un[count_un]) {
               i++;
               j++;
            } else {
               un[++count_un] = a[i];
               i++;
               j++;
            }
         } else {

            int small = (a[i] < b[j]) ? 1 : 2;
            if (small == 1) {
               if (a[i] == un[count_un])
                  i++;
               else {
                  un[++count_un] = a[i];
                  i++;
               }
            } else {
               if (b[j] == un[count_un])
                  j++;
               else {
                  un[++count_un] = b[j];
                  j++;
               }
            }
         }
      }

      while (i < n1) {
         if (a[i] == un[count_un])
            i++;
         else {
            un[++count_un] = a[i];
            i++;
         }
      }
      while (j < n2) {
         if (b[j] == un[count_un])
            j++;
         else {
            un[++count_un] = b[j];
            j++;
         }
      }

      System.out.println("\nunion");
      for (int k = 0; k <= count_un; k++)
         System.out.print(un[k] + ", ");

   }

}
