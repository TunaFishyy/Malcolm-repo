package io.github.TunaFishyy;

public class Main {
    // A bunch of programs checking if a dude named m4lc0lm is cringe. Enjoy ^-^

    static strictfp int sum() {
        //I just found out about the strictfp keyword wtf is that💀
        int num1 = 10, num2 = 10;

        return ( num1+num2 );
    }

    public static void doThis() { System.out.println( "Yes M4LC0LM very cring." ); }
    public static void doThat() { System.out.println( "Noo not at all." ); }

    @MalkomKrindz( flag = false )
    public static void work( boolean flag ) {
        if (flag/*Due to M4LC0LM's lack of knowledge (him being cringe), I'll mention that the boolean check
        if (flag) is same as if (flag == true), "true" being redudant.*/) doThis();
        else doThat();
    }

    /*
    __  ___   __ __    __    ______   ____     __     __  ___   ___   ___    _____                        _____    ____     ___    _____    ____                        _____    ______                         ____    ____     __ __                            __   ____    _____                         __  ___   ____  _____    ______   _____
   /  |/  /  / // /   / /   / ____/  / __ \   / /    /  |/  /  <  /  |__ \  |__  /                       / ___/   / __ \   /   |  / ___/   /  _/                       / ___/   / ____/                        / __ \  / __ \   / //_/                           / /  / __ \  / ___/                        /  |/  /  / __ \/__  /   / ____/  / ___/
  / /|_/ /  / // /_  / /   / /      / / / /  / /    / /|_/ /   / /   __/ /   /_ <                        \__ \   / /_/ /  / /| |  \__ \    / /                         \__ \   / __/                          / / / / / / / /  / ,<                         __  / /  / / / /  \__ \                        / /|_/ /  / / / /  / /   / __/     \__ \
 / /  / /  /__  __/ / /___/ /___   / /_/ /  / /___ / /  / /   / /   / __/  ___/ /                       ___/ /  / ____/  / ___ | ___/ /  _/ /                         ___/ /  / /___                         / /_/ / / /_/ /  / /| |                       / /_/ /  / /_/ /  ___/ /                       / /  / /  / /_/ /  / /__ / /___    ___/ /
/_/  /_/     /_/   /_____/\____/   \____/  /_____//_/  /_/   /_/   /____/ /____/                       /____/  /_/      /_/  |_|/____/  /___/                        /____/  /_____/                        /_____/  \____/  /_/ |_|                       \____/   \____/  /____/                       /_/  /_/   \____/  /____//_____/   /____/
*/

    public static void main(String[] args) {
        Main.work( true );

        //the so called Ternary Operator
        System.out.println( Main.sum() == 20 ? "Malcolm cringe? Da" : "Malcolm cringe? No" );
        /*                  //condition                ^                       ^
                                 |                     |                       |
                                 -----------------------------------------------
                                         True                    False

         */
    }

}