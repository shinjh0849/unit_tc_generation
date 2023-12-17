public JSModule(String name) { [EOL]     this.name = name; [EOL]     this.depth = -1; [EOL] } <line_num>: 62,65
@Override [EOL] public String getName() { [EOL]     return name; [EOL] } <line_num>: 68,71
@Override [EOL] public List<String> getProvides() { [EOL]     return ImmutableList.<String>of(name); [EOL] } <line_num>: 73,76
@Override [EOL] public List<String> getRequires() { [EOL]     ImmutableList.Builder<String> builder = ImmutableList.builder(); [EOL]     for (JSModule m : deps) { [EOL]         builder.add(m.getName()); [EOL]     } [EOL]     return builder.build(); [EOL] } <line_num>: 78,85
@Override [EOL] public String getPathRelativeToClosureBase() { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 87,90
public void add(SourceFile file) { [EOL]     add(new CompilerInput(file)); [EOL] } <line_num>: 93,95
public void addFirst(SourceFile file) { [EOL]     addFirst(new CompilerInput(file)); [EOL] } <line_num>: 98,100
public void add(CompilerInput input) { [EOL]     inputs.add(input); [EOL]     input.setModule(this); [EOL] } <line_num>: 103,106
void addAndOverrideModule(CompilerInput input) { [EOL]     inputs.add(input); [EOL]     input.overrideModule(this); [EOL] } <line_num>: 113,116
public void addFirst(CompilerInput input) { [EOL]     inputs.add(0, input); [EOL]     input.setModule(this); [EOL] } <line_num>: 119,122
public void addAfter(CompilerInput input, CompilerInput other) { [EOL]     Preconditions.checkState(inputs.contains(other)); [EOL]     inputs.add(inputs.indexOf(other), input); [EOL]     input.setModule(this); [EOL] } <line_num>: 125,129
public void addDependency(JSModule dep) { [EOL]     Preconditions.checkNotNull(dep); [EOL]     Preconditions.checkState(dep != this); [EOL]     deps.add(dep); [EOL] } <line_num>: 132,136
public void remove(CompilerInput input) { [EOL]     input.setModule(null); [EOL]     inputs.remove(input); [EOL] } <line_num>: 139,142
public void removeAll() { [EOL]     for (CompilerInput input : inputs) { [EOL]         input.setModule(null); [EOL]     } [EOL]     inputs.clear(); [EOL] } <line_num>: 145,150
public List<JSModule> getDependencies() { [EOL]     return deps; [EOL] } <line_num>: 157,159
List<String> getSortedDependencyNames() { [EOL]     List<String> names = Lists.newArrayList(); [EOL]     for (JSModule module : getDependencies()) { [EOL]         names.add(module.getName()); [EOL]     } [EOL]     Collections.sort(names); [EOL]     return names; [EOL] } <line_num>: 165,172
public Set<JSModule> getAllDependencies() { [EOL]     Set<JSModule> allDeps = Sets.newHashSet(deps); [EOL]     List<JSModule> workList = Lists.newArrayList(deps); [EOL]     while (workList.size() > 0) { [EOL]         JSModule module = workList.remove(workList.size() - 1); [EOL]         for (JSModule dep : module.getDependencies()) { [EOL]             if (allDeps.add(dep)) { [EOL]                 workList.add(dep); [EOL]             } [EOL]         } [EOL]     } [EOL]     return allDeps; [EOL] } <line_num>: 178,190
public Set<JSModule> getThisAndAllDependencies() { [EOL]     Set<JSModule> deps = getAllDependencies(); [EOL]     deps.add(this); [EOL]     return deps; [EOL] } <line_num>: 193,197
public List<CompilerInput> getInputs() { [EOL]     return inputs; [EOL] } <line_num>: 204,206
public CompilerInput getByName(String name) { [EOL]     for (CompilerInput input : inputs) { [EOL]         if (name.equals(input.getName())) { [EOL]             return input; [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 209,216
public boolean removeByName(String name) { [EOL]     boolean found = false; [EOL]     Iterator<CompilerInput> iter = inputs.iterator(); [EOL]     while (iter.hasNext()) { [EOL]         CompilerInput file = iter.next(); [EOL]         if (name.equals(file.getName())) { [EOL]             iter.remove(); [EOL]             file.setModule(null); [EOL]             found = true; [EOL]         } [EOL]     } [EOL]     return found; [EOL] } <line_num>: 221,233
@Override [EOL] public String toString() { [EOL]     return name; [EOL] } <line_num>: 236,239
public void clearAsts() { [EOL]     for (CompilerInput input : inputs) { [EOL]         input.clearAst(); [EOL]     } [EOL] } <line_num>: 245,249
public void sortInputsByDeps(Compiler compiler) { [EOL]     for (CompilerInput input : inputs) { [EOL]         input.setCompiler(compiler); [EOL]     } [EOL]     try { [EOL]         List<CompilerInput> sortedList = (new SortedDependencies<CompilerInput>(Collections.<CompilerInput>unmodifiableList(inputs))).getSortedList(); [EOL]         inputs.clear(); [EOL]         inputs.addAll(sortedList); [EOL]     } catch (CircularDependencyException e) { [EOL]         compiler.report(JSError.make(CIRCULAR_DEPENDENCY_ERROR, e.getMessage())); [EOL]     } [EOL] } <line_num>: 254,273
public static JSModule[] sortJsModules(Collection<JSModule> modules) throws CircularDependencyException { [EOL]     List<JSModule> sortedList = (new SortedDependencies<JSModule>(Lists.newArrayList(modules))).getSortedList(); [EOL]     return sortedList.toArray(new JSModule[sortedList.size()]); [EOL] } <line_num>: 283,289
public void setDepth(int dep) { [EOL]     this.depth = dep; [EOL] } <line_num>: 294,296
public int getDepth() { [EOL]     return depth; [EOL] } <line_num>: 301,303
