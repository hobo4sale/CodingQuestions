private Project[] buildOrder(String[] projects, String[][] dependencies) {
  Graph graph = buildGraph(projects, dependencies);

}

private Graph buildGraph(String[] projects, String[][] dependencies) {
  Graph graph = new Graph();
  for(String str: projects) {
    graph.createNode(str);
  }

  for(String[] pair : dependencies) {
    String one = pair[0];
    String two = pair[1];
    graph.addEdge(one, two);
  }
  return graph; 
}
