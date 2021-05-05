package Classes;

public class Matricula {

	//Atributos
		private Estudante estudante;
		private Disciplina disciplina;
		
		public Estudante getEstudante() {
			return estudante;
		}
		public void setEstudante(Estudante estudante) {
			this.estudante = estudante;
		}
		public Disciplina getDisciplina() {
			return disciplina;
		}
		public void setDisciplina(Disciplina disciplina) {
			this.disciplina = disciplina;
		}
		
		public Matricula(Estudante estudantesRef, Disciplina disciplinaRef) {
			this.estudante = estudantesRef;
			this.disciplina = disciplinaRef;
			//System.out.println(disciplinas);
			//System.out.println(estudantes);
		}
		public void add(Estudante estudantesRef, Disciplina disciplinaRef) {
			this.estudante = estudantesRef;
			this.disciplina = disciplinaRef;
		}
}
