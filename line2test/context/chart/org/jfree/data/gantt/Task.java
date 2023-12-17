public Task(String description, TimePeriod duration)
public Task(String description, Date start, Date end)
public String getDescription()
public void setDescription(String description)
public TimePeriod getDuration()
public void setDuration(TimePeriod duration)
public Double getPercentComplete()
public void setPercentComplete(Double percent)
public void setPercentComplete(double percent)
public void addSubtask(Task subtask)
public void removeSubtask(Task subtask)
public int getSubtaskCount()
public Task getSubtask(int index)
public boolean equals(Object object)
public Object clone() throws CloneNotSupportedException
long serialVersionUID=Optional[1094303785346988894L]
String description
TimePeriod duration
Double percentComplete
List subtasks
