package Adapter;

import Adapter.adapter.SquarePegAdapter;
import Adapter.round.RoundHole;
import Adapter.round.RoundPeg;
import Adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if (hole.fits(roundPeg)) {
            System.out.println("round peg fits round hole.");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        if (hole.fits(smallSquarePegAdapter)) {
            System.out.println("small square peg fits round hole.");
        } else {
            System.out.println("small square peg doesn't fit round hole.");
        }

        if (hole.fits(largeSquarePegAdapter)) {
            System.out.println("large square peg fits round hole.");
        } else {
            System.out.println("large square peg doesn't fit round hole.");
        }
    }
}
