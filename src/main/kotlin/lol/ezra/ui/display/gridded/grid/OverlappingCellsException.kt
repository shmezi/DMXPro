package lol.ezra.ui.display.gridded.grid

class OverlappingCellsException(x: Int, y: Int) : Exception("Two cells are overlapping at: $x $y") {
}