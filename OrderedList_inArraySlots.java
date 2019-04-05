//Started from Mr.Holmes solution.
/** 
  OrderedList_inArraySlots
  
  A list with the invariant the elements are in order by
  increasing value, implemented using a
  List_inArraySlots
 */

public class OrderedList_inArraySlots implements OrderedList {

    private List_inArraySlots list_iAS;

    public OrderedList_inArraySlots() {
        list_iAS = new List_inArraySlots();
    }

    public int size() {
      return list_iAS.size();
    }
    /** 
      @return a string representation of this Orderedlist_iAS
     */
    public String toString() {
        return list_iAS.toString();
    }

    
    /** 
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public void add( int value) {
         int dest = 0;
         for( ; dest < list_iAS.size() && list_iAS.get( dest) < value
            ; dest++) ;
         // System.out.println( "OL adding " + value
         //                   + " at index " + dest);
         list_iAS.add( dest, value);
     }

  //   private void expand() {
  //     System.out.println( "expand... (for debugging)");
  //           S.O.P. rules for debugging:
  //             Working methods should be silent. But during
  //             development, the programmer must verify that
  //             this method is called when that is appropriate.
  //             So test using the println(), then comment it out.
              
  //       int[] bigger = new int[ elements.length * 2];
  //       for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
  //           bigger[ elemIndex] = elements[ elemIndex];
  //       elements = bigger;
  // }

    public int get( int index) {
      int elementVal;
      int indexOf = 0;
      for( int i = 0; i <= index; i++) {
        indexOf = i;
      }
      return elementVal = list_iAS.get( index);
  }

    public int remove( int index) {
      return list_iAS.remove( index);
      // int indexOf;
      // for( int i = 0; i <= index; i++)
      //   indexOf = i;
      // for( int counter = i; counter < list_iAS.size(); counter++){
      //   list_iAS.elements
      }
    }