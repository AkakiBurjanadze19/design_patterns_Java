package Adapter.adapter;

import Adapter.round.RoundPeg;
import Adapter.square.SquarePeg;

/* Adapter allows fitting square pegs into round holes */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}
