/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_05;

import java.io.*;

/**
 *
 * @author billy
 */
public class LookUpTable {

    private Name[] name;
    private int nameCount;

    public LookUpTable(int n) {
        name = new Name[n];
        nameCount = 0;
    }

    public void read(BufferedReader sc) throws IOException {
        boolean more = true;

        while (more && nameCount < name.length) {
            String k = sc.readLine();
            String v = null;

            if (k != null) {
                v = sc.readLine();
            }
            if (v != null) {
                name[nameCount] = new Name(k, v);
                nameCount++;
            } else {
                more = false;
            }
        }
        MergeSorter m = new MergeSorter(name);
        m.sort();
    }

    public void reverse(LookUpTable b) {
        nameCount = Math.min(b.nameCount, name.length);
        for (int i = 0; i < nameCount; i++) {
            name[i] = new Name(b.name[i].getValue(), b.name[i].getKey());
        }
        MergeSorter m = new MergeSorter(name);
        m.sort();
    }

    public String lookup(String k) {
        BinarySearch b = new BinarySearch(name);
        int pos = b.binarySearch(0, nameCount - 1, k);
        if (pos < 0) {
            return "Not found";
        } else {
            return name[pos].getValue();
        }
    }
}
