private GuardComparator(Map<WarningsGuard, Integer> orderOfAddition)
public ComposeWarningsGuard(List<WarningsGuard> guards)
public ComposeWarningsGuard(WarningsGuard... guards)
public int compare(WarningsGuard a, WarningsGuard b)
 void addGuard(WarningsGuard guard)
private void addGuards(Iterable<WarningsGuard> guards)
public CheckLevel level(JSError error)
public boolean disables(DiagnosticGroup group)
public boolean enables(DiagnosticGroup group)
 List<WarningsGuard> getGuards()
 ComposeWarningsGuard makeEmergencyFailSafeGuard()
public String toString()
long serialVersionUID=Optional[1L]
Map<WarningsGuard, Integer> orderOfAddition=Optional[Maps.newHashMap()]
int numberOfAdds=Optional[0]
Comparator<WarningsGuard> guardComparator=Optional[new GuardComparator(orderOfAddition)]
boolean demoteErrors=Optional[false]
TreeSet<WarningsGuard> guards=Optional[new TreeSet<WarningsGuard>(guardComparator)]
