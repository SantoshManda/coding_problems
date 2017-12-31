package org.coding.santosh;

import java.io.File;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MinimumCostFlightsProblemGraph {
	
	public static ArrayList<Integer>[] adjacencyList=null;
	public static int noOfVertices;
	public static int[] Distance;
	
	
	public MinimumCostFlightsProblemGraph(int noOfVertices)
	{
		adjacencyList=(ArrayList<Integer>[])new ArrayList[noOfVertices+1];
		this.noOfVertices=noOfVertices;
		Distance = new int[noOfVertices];
		for(int i=0;i<(noOfVertices+1);i++)
			adjacencyList[i]=new ArrayList<Integer>();
	}

	/**
	 * 
	 * @param u
	 * @param v
	 * @param w
	 * To add edges to the adjacency list in graph
	 */
	public void addEdge(int u, int v)
	{
		if(adjacencyList[u]==null)
			adjacencyList[u]=new ArrayList<Integer>();
		adjacencyList[u].add(v);
	}
	
	/**
	 * 
	 * @param u
	 * @param v
	 * To remove the edge from the graph
	 */
	public void removeEdge(int u, int v)
	{
		int indexToBeRemoved=-1;
		ArrayList<Integer> edgeList=adjacencyList[u];
		for(int i=0;i<adjacencyList[u].size();i++)
		{
			int val=edgeList.get(i);
			if(val==v)
			{
				indexToBeRemoved=i;
			}
		}
		edgeList.remove(indexToBeRemoved);
	}
	
	/**
	 * Method to verify whether u and v are neighbors
	 * @param u
	 * @param v
	 * @return
	 */
	public boolean isNeighbor(int u, int v)
	{
		if(adjacencyList[u]==null)
			return false;
		return adjacencyList[u].contains(v);
					
	}
	
	/**
	 * Method to return the size of the graph
	 * @return
	 */
	public int size()
	{
		return adjacencyList.length;
	}
	/**
	 * 
	 * @param u
	 * @return
	 * To return the outgoing edges for the given source
	 */
	public ArrayList<Integer> getOutEdges(int u)
	{
		return adjacencyList[u];
	}

	/**
	 * Method to return the adjacency list
	 * @return
	 */
	public ArrayList<Integer>[] getAdjacencyList()
	{
		return adjacencyList;
	}
	
	public static class ElementPriority implements Comparable<ElementPriority> {
	    int element;
	    int priority;
	    public ElementPriority(int element, int priority)
	    {
	    	this.element= element;
	    	this.priority= priority;
	    }
	    @Override public int compareTo(ElementPriority other) {
	        return Integer.compare(this.priority, other.priority);
	    }
	}
	
	public static ArrayList<Integer> doBFSShortestPath(MinimumCostFlightsProblemGraph graph, int source, int dest)
	{
		int d = 0,i=1;
		ArrayList<Integer> shortestPathList = new ArrayList<Integer>();
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		PriorityQueue<ElementPriority> queue = new PriorityQueue<ElementPriority>();
		if (source == dest)
			return null;
		
		Stack<Integer> pathStack = new Stack<Integer>();

		queue.add(new ElementPriority(source,1));
		pathStack.add(source);
		for(int j = 0 ; j< noOfVertices ; j++ )
		{
			Distance[j]= -1;
		}
		visited.put(source, true);
		Distance[source]=0;
		while(!queue.isEmpty())
		{
			int u = queue.poll().element;
			ArrayList<Integer> adjList = graph.getOutEdges(u);

			for(int v =0 ; v <  adjList.size();v++)
			{
				d = Distance[v]+5;
				if(d%3 != 0)
				{
					while((d+i)%3 != 0)
					{
						i++;
					}
					d = d + i;
				}
				
				if(!visited.containsKey(v))
				{
					if(Distance[v] == -1)
					{
						Distance[v] = d;
						queue.add(new ElementPriority(v,d));
						pathStack.add(v);
					}
					if(Distance[v] > d)
					{
						Distance[v] = d;
						queue.poll();
						queue.add(new ElementPriority(v,d));
						pathStack.add(v);
					}
					
					if(u == dest)
						break;
				}
			}
		}


		//To find the path
		int node, currentSrc=dest;
		shortestPathList.add(dest);
		while(!pathStack.isEmpty())
		{
			node = pathStack.pop();
			if(graph.isNeighbor(currentSrc, node))
			{
				shortestPathList.add(node);
				currentSrc = node;
				if(node == source)
					break;
			}
		}

		return shortestPathList;
}
	
	public void printGraph()
	{
		ArrayList<Integer> edgeList;
		for(int i=1;i<=noOfVertices;i++)
		{
			edgeList=adjacencyList[i];
			if(edgeList!=null)
			{
			for(int v : edgeList)
				System.out.println("u : "+i+" v : "+v);
			}
		}
}
	
	
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        //Scanner
    	//String workingDir = System.getProperty("user.dir");
    	//File file = new File("C:\\data_files\\input1.txt");
    	//File file = new File("input1.txt");
      //  System.out.println("Attempting to read from file in: "+file.getCanonicalPath());
        int v, e, count = 1, to = 0, from = 0 , reload = 0 , cost = 0 , source = -5 , target = -5;
        Scanner s = new Scanner(new File("D:\\data_files\\input2.txt"));
        MinimumCostFlightsProblemGraph graph;
      //  String name = s.nextLine();                 // Reading input from STDIN
      //  String[] values = name.split(" ");
        v = s.nextInt();
        e = s.nextInt();
        graph = new MinimumCostFlightsProblemGraph(v);
        reload = s.nextInt();
        cost = s.nextInt();
        
        for (int i = 1 ; i <= e; i++)
        	{
        	
            to = s.nextInt();

            from = s.nextInt();
            
            graph.addEdge(to, from);
            graph.addEdge(from, to);
        	
        	}
        
        source = s.nextInt();
        target = s.nextInt();
        
        //graph.printGraph();
        ArrayList<Integer> shortestPathList = doBFSShortestPath(graph, source, target);
        System.out.println(shortestPathList.size());
        for(int node = shortestPathList.size()-1 ; node >= 0 ; node--)
		{
			System.out.print(shortestPathList.get(node)+" ");
		}
    }
}
