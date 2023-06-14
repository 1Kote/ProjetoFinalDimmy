package game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main
{

    private int numVertices;
    private List<Integer>[] adjacencyList;
    private Map<Integer, String> countryNames;
    
    @SuppressWarnings("unchecked")
	public Main(int numVertices) 
    {
    	this.numVertices = numVertices;
        adjacencyList = new ArrayList[numVertices];
        countryNames = new HashMap<>();
        for (int i = 0; i < numVertices; i++) 
        {
        	adjacencyList[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int source, int destination) 
    {
        adjacencyList[source].add(destination);
        adjacencyList[destination].add(source);
    }

    public List<Integer> getNeighbors(int vertex) 
    {
        return adjacencyList[vertex];
    }

    public int getNumVertices() 
    {
        return numVertices;
    }

    public String getCountryName(int vertex) 
    {
        return countryNames.get(vertex);
    }

    public void setCountryName(int vertex, String name) 
    {
        countryNames.put(vertex, name);
    }

    public void traverseGraph() 
    {
        boolean[] visited = new boolean[numVertices];
        for (int i = 0; i < numVertices; i++) 
        {
            if (!visited[i]) 
            {
                System.out.print("Traversal starting from " + getCountryName(i) + ": ");
                dfs(i, visited);
                System.out.println();
            }
        }
    }

    private void dfs(int currentVertex, boolean[] visited)
    {
        visited[currentVertex] = true;
        System.out.print(getCountryName(currentVertex) + " ");

        List<Integer> neighbors = adjacencyList[currentVertex];
        for (int neighbor : neighbors) 
        {
            if (!visited[neighbor]) 
            {
                dfs(neighbor, visited);
            }
        }
    }

	
	public static void main(String[] args) 
	{
	     int numVertices = 17;
	     Main mapNodes = new Main(numVertices);
	     // Definindo os nomes dos países
	     mapNodes.setCountryName(0, "UBU");
	     mapNodes.setCountryName(1, "KLE");
	     mapNodes.setCountryName(2, "PNE");
	     mapNodes.setCountryName(3, "PGR");
	     mapNodes.setCountryName(4, "PDO");
	     mapNodes.setCountryName(5, "KLA");
	     mapNodes.setCountryName(6, "GDS");
	     mapNodes.setCountryName(7, "KOL");
	     mapNodes.setCountryName(8, "KKA");
	     mapNodes.setCountryName(9, "DEF");
	     mapNodes.setCountryName(10, "ALE");
	     mapNodes.setCountryName(11, "VEM");
	     mapNodes.setCountryName(12, "CSU");
	     mapNodes.setCountryName(13, "PKA");
	     mapNodes.setCountryName(14, "BUN");
	     mapNodes.setCountryName(15, "PKA");
	     mapNodes.setCountryName(16, "NAR");

	     // Adicionando as arestas do grafo
	     for (int i = 0; i < numVertices - 1; i++)
	     {
	    	 mapNodes.addEdge(i, i + 1);
	     }

	        // Percorrendo o grafo
	        mapNodes.traverseGraph();
	        
	     
		
		
	}
	
	
	
}