/*
Write an interface called Playable, with a method
void play();
Let this interface be placed in a package called Topic2.Assignment6.music.
Write a class called Veena which implements Playable interface. Let this class be placed in a
package Topic2.Assignment6.music.string
Write a class called Saxophone which implements Playable interface. Let this class be placed in
a package Topic2.Assignment6.music.wind
Write another class Test in a package called live. Then,
a. Create an instance of Veena and call play() method
b. Create an instance of Saxophone and call play() method
c. Place the above instances in a variable of type Playable and then call play()
*/

package Topic2.Assignment6.live;

import Topic2.Assignment6.music.Playable;
import Topic2.Assignment6.music.string.Veena;
import Topic2.Assignment6.music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena v = new Veena();
        v.play();
        Playable pv = new Veena();
        pv.play();
        Saxophone s = new Saxophone();
        s.play();
        Playable ps = new Saxophone();
        ps.play();
    }
}
