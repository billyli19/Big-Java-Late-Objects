/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_05;

/**
 *
 * @author billy
 */
public class MergeSorter {

    private Name[] a;

    public MergeSorter(Name[] aName) {
        a = aName;
    }

    public void sort() {
        if (a.length <= 1) {
            return;
        }

        Name[] first = new Name[a.length / 2];
        Name[] second = new Name[a.length - first.length];

        System.arraycopy(a, 0, first, 0, first.length);
        System.arraycopy(a, first.length, second, 0, second.length);

        MergeSorter firstSorter = new MergeSorter(first);
        MergeSorter secondSorter = new MergeSorter(second);

        firstSorter.sort();
        secondSorter.sort();

        merge(first, second);
    }
    
    private void merge(Name[] first, Name[] second){
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        
        while(iFirst < first.length && iSecond < second.length){
            if(first[iFirst].getKey().compareTo(second[iSecond].getKey()) < 0){
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        System.arraycopy(first, iFirst, a, j, first.length - iFirst);
        System.arraycopy(second, iSecond, a, j, second.length - iSecond);
    }
}
