package practice.project.entity;

import java.util.Date;

import practice.project.util.Page;

public class Inform extends Page{
    private String id;

    private String title;

    private Date showTime;

    private String managerId;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inform other = (Inform) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Inform [id=" + id + ", title=" + title + ", showTime=" + showTime + ", managerId=" + managerId
				+ ", content=" + content + "]";
	}

//	@Override
//	public String toString() {
//		long time = showTime.getTime();
//		return "Inform [id=" + id + ", title=" + title + ", showTime=" + time + ", managerId=" + managerId
//				+ ", content=" + content + "]";
//	}
    
    
}