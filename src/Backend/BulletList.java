/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.util.ArrayList;

public class BulletList {
    private ArrayList<BulletListItem> itemList = new ArrayList<>();
    public void addBulletListItem(BulletListItem item ){
        this.itemList.add(item);
         
    }

    public ArrayList<BulletListItem> getItemList() {
        return itemList;
    }
    
    
 
}
