public Task(String description, TimePeriod duration) { [EOL]     if (description == null) { [EOL]         throw new IllegalArgumentException("Null 'description' argument."); [EOL]     } [EOL]     this.description = description; [EOL]     this.duration = duration; [EOL]     this.percentComplete = null; [EOL]     this.subtasks = new java.util.ArrayList(); [EOL] } <line_num>: 84,92
public Task(String description, Date start, Date end) { [EOL]     this(description, new SimpleTimePeriod(start, end)); [EOL] } <line_num>: 102,104
public String getDescription() { [EOL]     return this.description; [EOL] } <line_num>: 111,113
public void setDescription(String description) { [EOL]     if (description == null) { [EOL]         throw new IllegalArgumentException("Null 'description' argument."); [EOL]     } [EOL]     this.description = description; [EOL] } <line_num>: 120,125
public TimePeriod getDuration() { [EOL]     return this.duration; [EOL] } <line_num>: 132,134
public void setDuration(TimePeriod duration) { [EOL]     this.duration = duration; [EOL] } <line_num>: 141,143
public Double getPercentComplete() { [EOL]     return this.percentComplete; [EOL] } <line_num>: 150,152
public void setPercentComplete(Double percent) { [EOL]     this.percentComplete = percent; [EOL] } <line_num>: 159,161
public void setPercentComplete(double percent) { [EOL]     setPercentComplete(new Double(percent)); [EOL] } <line_num>: 168,170
public void addSubtask(Task subtask) { [EOL]     if (subtask == null) { [EOL]         throw new IllegalArgumentException("Null 'subtask' argument."); [EOL]     } [EOL]     this.subtasks.add(subtask); [EOL] } <line_num>: 177,182
public void removeSubtask(Task subtask) { [EOL]     this.subtasks.remove(subtask); [EOL] } <line_num>: 189,191
public int getSubtaskCount() { [EOL]     return this.subtasks.size(); [EOL] } <line_num>: 198,200
public Task getSubtask(int index) { [EOL]     return (Task) this.subtasks.get(index); [EOL] } <line_num>: 209,211
public boolean equals(Object object) { [EOL]     if (object == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(object instanceof Task)) { [EOL]         return false; [EOL]     } [EOL]     Task that = (Task) object; [EOL]     if (!ObjectUtilities.equal(this.description, that.description)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.duration, that.duration)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.percentComplete, that.percentComplete)) { [EOL]         return false; [EOL]     } [EOL]     if (!ObjectUtilities.equal(this.subtasks, that.subtasks)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 220,242
public Object clone() throws CloneNotSupportedException { [EOL]     Task clone = (Task) super.clone(); [EOL]     return clone; [EOL] } <line_num>: 252,255
