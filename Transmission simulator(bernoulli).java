//Aakash Tyagi

public class Successfulmessage {
	
	public static void averageTimeToSendMessage()
	{
			double averageTimeSucess=0.0,probabilityOfSendingMsg=0.5,randomNumber=0.0;
			int totalSimulationRuns=10,timeSlot=0,totalNumberOfComputers=15,indexOfArray=0;
			
			
			for(int i=0;i<totalSimulationRuns;i++)
			{ 
			    int computersSentSuccessfully=0;
			    boolean computers[]=new boolean[totalNumberOfComputers];
				
				while(computersSentSuccessfully<totalNumberOfComputers)
				{
					int computerSendingMessage=0;
				   for(int j=0;j<totalNumberOfComputers;j++)
					{
				      randomNumber=Math.random();
				    
				      if(randomNumber<probabilityOfSendingMsg)
				       {
				    	  
				    	  computerSendingMessage++;
				    	  indexOfArray=j;
				    	  
				       }
					}
				   	  if(computerSendingMessage==1 && computers[indexOfArray]==false)
				   	  {
				   		
					   computers[indexOfArray]=true;
					   computersSentSuccessfully++;
					   
					   					   
				   	  }
				   	timeSlot++;
				}
								
			}
			averageTimeSucess=(double)timeSlot/totalSimulationRuns;
			System.out.println("Total Simulation Runs : "+totalSimulationRuns);
			System.out.println("Total Computers       : "+totalNumberOfComputers);
			System.out.println("Average Time Required : "+averageTimeSucess);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		averageTimeToSendMessage();
	}

}
