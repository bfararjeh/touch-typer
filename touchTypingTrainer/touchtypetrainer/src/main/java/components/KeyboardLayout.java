package components;

import java.util.*;

/*
 * this class will be responsible for knowing which letters the user types 
 *      with each finger, allowing difficulty to be customised
 */
public class KeyboardLayout {

    public List<Character> homerow;

    public List<Character> leftPinky;
    public List<Character> leftRing;
    public List<Character> leftMid;
    public List<Character> leftIndex;

    public List<Character> rightPinky;
    public List<Character> rightRing;
    public List<Character> rightMid;
    public List<Character> rightIndex;


    /*
     * sets the default keyboard layout for determining training exercises
     */
    public void setDefaultLayout() {

        homerow.addAll(Arrays.asList('a','s','d','f','j','k','l',';'));
    
        leftPinky.addAll(Arrays.asList('q','a','z'));
        leftRing.addAll(Arrays.asList('w','s','x'));
        leftMid.addAll(Arrays.asList('e','d','c'));
        leftIndex.addAll(Arrays.asList('r','f','v','t','g','b'));

    
        rightPinky.addAll(Arrays.asList(';','p','\''));
        rightRing.addAll(Arrays.asList('l','.','o'));
        rightMid.addAll(Arrays.asList('i','k',','));
        rightIndex.addAll(Arrays.asList('u','j','m','y','h','n'));
    }

    /*
     * until i figure out how to pass the correct arguments (char to change,
     *      list to change to) ima leave this function empty
     */
    public void changeKeyBinding() {

    }

}