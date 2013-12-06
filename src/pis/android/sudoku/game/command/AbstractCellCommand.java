package pis.android.sudoku.game.command;

import pis.android.sudoku.game.CellCollection;

/**
 * Generic command acting on one or more cells.
 * 
 * @author romario
 *
 */
public abstract class AbstractCellCommand extends AbstractCommand {

	private CellCollection mCells;

	protected CellCollection getCells() {
		return mCells;
	}

	protected void setCells(CellCollection mCells) {
		this.mCells = mCells;
	}
	
}
