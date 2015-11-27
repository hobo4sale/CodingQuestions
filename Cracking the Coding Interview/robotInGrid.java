public class Point {
  int row;
  int col;

  public Path(int row, int col) {
    this.row = row;
    this.col = col;
  }

}

private ArrayList<Point> getPath(boolean [][]maze) {
  if(maze == null || maze.length == 0) {
    return null;
  }

  ArrayList<Point> path = new ArrayList<Point>();
  HashMap<Point, Boolean> cache = new HashMap<Point,Boolean>();
  if(getPath(maze, maze.length - 1, maze[0].length - 1, path,cache)) {
    return path;
  }
  return null;
}

private boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashMap<Point, Boolean> cache) {
  if(col < 0 || row < 0 || !maze[row][col]) {
    return false;
  }

  Point p = new Point(row, col);
  if(cache.containsKey(p)) {
    return cache.get(p);
  }

  boolean isOrigin = (row == 0) && (col == 0);
  boolean success = false;

  if(isOrigin || getPath(maze, row, col - 1, path) || getPath(maze, row - 1, col -1, path)) {
    path.add(p)
    sucess = true;
  }
  cache.put(p, success);
  return sucess;
}
