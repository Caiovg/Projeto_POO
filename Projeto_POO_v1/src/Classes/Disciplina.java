package Classes;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	//Atributos
		private String codigo_disciplina;
		private int creditos_disciplina;
		private List<Matricula> matriculas;
		
		//Metodos Get e Set
		public String getCodigo_disciplina() {
			return codigo_disciplina;
		}
		public void setCodigo_disciplina(String codigo_disciplina) {
			this.codigo_disciplina = codigo_disciplina;
		}
		public int getCreditos_disciplina() {
			return creditos_disciplina;
		}
		public void setCreditos_disciplina(int creditos_disciplina) {
			this.creditos_disciplina = creditos_disciplina;
		}
		
		
		//Correto ->
		public List<Matricula> getMatriculas() {
			return matriculas;
		}
		public void setMatriculas(List<Matricula> matriculas) {
			this.matriculas = matriculas;
		}
		//
		
		public void addMatricula(Matricula matricula) {
			this.matriculas.add(matricula);        
		} 
		
		public Disciplina(String codigo, int carga_horaria) {
			this.codigo_disciplina = codigo;
			this.creditos_disciplina = carga_horaria;
			this.matriculas = new ArrayList<>();
		}
		
		public List<Estudante> getEstudantesMatriculados(){
			List<Estudante> estudantes = new ArrayList<>();
			for(Matricula matricula : matriculas) {
				estudantes.add(matricula.getEstudante());
			}
			return estudantes;
		}
}
