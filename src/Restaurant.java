/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author indri
 */
public class Restaurant {
    private DataMenu[] menuList;
    private int menuCount;
    
    public Restaurant(int size){
        menuList = new DataMenu[size];
        menuCount = 0;
    }
    
    public void addMenu (DataMenu menu){
        if (menuCount < menuList.length){
            menuList[menuCount++]= menu;
        } else {
            System.out.println("Daftar menu Penuh");
        }
    }
    
    public void updateMenu(int index, DataMenu  newMenu){
        if (index >=0 && index < menuCount){
            menuList[index]=newMenu;
        } else {
            System.out.println("Index tidak valid");
        }
    }
    
    public void showMenu() {
        for (int i = 0; i < menuCount; i++) {
            System.out.println((i + 1) + ". " + menuList[i]);
        }
    }

    public void deleteMenu(int index) {
        if (index >= 0 && index < menuCount) {
            for (int i = index; i < menuCount - 1; i++) {
                menuList[i] = menuList[i + 1];
            }
            menuList[--menuCount] = null;
        } else {
            System.out.println("Indeks tidak valid!");
    }
    
    }
}
