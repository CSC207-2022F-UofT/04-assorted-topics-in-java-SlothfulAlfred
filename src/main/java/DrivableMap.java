/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /**
     * Adds Drivable d to driveable_map with key id. Returns true if (id, d) was
     * added and false if id is already in driveable_map.
     * @param id the id of the Driveable object
     * @param d the Drivable object
     * @return false if id is a key in driveable_map, true otherwise
     */
    public boolean addDrivable(String id, Drivable d) {
        if (drivable_map.containsKey(id)) return false;
        drivable_map.put(id, d);
        return true;
    }


    /**
     * Returns true if any Drivable in drivable_map has max speed greater than
     * or equal to speed
     * @param speed the speed to be compared with drivable_map
     * @return true iff there exists an element in drivable_map with max speed >= speed
     */
    boolean hasFasterThan(int speed) {
        for (Drivable d : drivable_map.values()) {
            if (d.getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }


    /**
     * Returns a List containing all Tradable items in drivable_map
     *
     * @return a List of all Tradable items in drivable_map
     */
    List<Tradable> getTradable() {
        List<Tradable> lst = new ArrayList<Tradable>();
        drivable_map.forEach((key, value) -> {
            if (value instanceof Tradable) {
                lst.add((Tradable) value);
            }
        });
        return lst;
    }



    
}