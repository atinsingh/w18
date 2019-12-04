package co.pragra.app;

import java.util.ArrayList;
import java.util.List;

public class GuestDemo {
    private List<String> guests;

    public GuestDemo() {
        this.guests = new ArrayList<>();
    }

    public void addToGuestList(String name){
        this.guests.add(name);
    }

    public void removeFromList(String name){
        if(this.guests.contains(name)){
            this.guests.remove(name);
        }else{
            throw new IllegalArgumentException("So much name in the list");
        }
    }

    public void printList(){
        System.out.println(this.guests);
    }

    public void printSorted(){

    }

    public List<String> getGuests() {
        return guests;
    }
}
