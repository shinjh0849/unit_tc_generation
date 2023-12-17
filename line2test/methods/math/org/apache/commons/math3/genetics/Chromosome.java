public double getFitness() { [EOL]     if (this.fitness == NO_FITNESS) { [EOL]         this.fitness = fitness(); [EOL]     } [EOL]     return this.fitness; [EOL] } <line_num>: 42,48
public int compareTo(final Chromosome another) { [EOL]     return ((Double) this.getFitness()).compareTo(another.getFitness()); [EOL] } <line_num>: 61,63
protected boolean isSame(final Chromosome another) { [EOL]     return false; [EOL] } <line_num>: 72,74
protected Chromosome findSameChromosome(final Population population) { [EOL]     for (Chromosome anotherChr : population) { [EOL]         if (this.isSame(anotherChr)) { [EOL]             return anotherChr; [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 83,90
public void searchForFitnessUpdate(final Population population) { [EOL]     Chromosome sameChromosome = findSameChromosome(population); [EOL]     if (sameChromosome != null) { [EOL]         fitness = sameChromosome.getFitness(); [EOL]     } [EOL] } <line_num>: 98,103
