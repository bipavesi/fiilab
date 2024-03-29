package teamsoftware.tests;

import java.util.StringTokenizer;

import teamsoftware.InterpreteRapporti;
import teamsoftware.Log;

public class InterpreteRapportiDiTest implements InterpreteRapporti {

	/* (non-Javadoc)
	 * @see teamsoftware.InterpreteRapporti#creaLogDaRapportoCompleto(java.lang.String)
	 */
	@Override
	public Log creaLogDaRapportoCompleto(String rapporto) {
		StringTokenizer tokenizer=new StringTokenizer(rapporto);

		String nome=tokenizer.nextToken();
		String cognome=tokenizer.nextToken();
		String ore=tokenizer.nextToken();
		String compito=tokenizer.nextToken();
		String data=tokenizer.nextToken();
		
		Log log=new Log(nome, cognome, ore, compito);
		return log;
	}

	/* (non-Javadoc)
	 * @see teamsoftware.InterpreteRapporti#creaRapportoSinteticoDaLog(teamsoftware.Log)
	 */
	@Override
	public String creaRapportoSinteticoDaLog(Log log) {
		return log.getNome()+" "+log.getCognome()+" "+
			log.getOre()+" "+log.getCompito()+" "+log.getOre();
	}
	
	/* (non-Javadoc)
	 * @see teamsoftware.InterpreteRapporti#creaLogDaRapportoSintetico(java.lang.String)
	 */
	@Override
	public Log creaLogDaRapportoSintetico(String string) {
		StringTokenizer tokenizer2=new StringTokenizer(string);
		//"Giuseppe Verdi 12 Testing 12",
		
		String nome2=tokenizer2.nextToken();
		String cognome2=tokenizer2.nextToken();
		String ore2=tokenizer2.nextToken();
		String compito2=tokenizer2.nextToken();
		
		Log log2=new Log(nome2, cognome2, ore2, compito2);
		return log2;
	}
}
