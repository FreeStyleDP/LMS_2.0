package practice.project.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Book {
    private String bookId;

    private String bookName;

    private String bookStyle;

    private String bookAuthor;

    private String bookPub;

    private Date bookInTime;

    private String status;

    private String imgPath;

    private Integer bookHot;

    private String bookRem;

    private BigDecimal price;

    private String bookComment;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookStyle() {
        return bookStyle;
    }

    public void setBookStyle(String bookStyle) {
        this.bookStyle = bookStyle == null ? null : bookStyle.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public String getBookPub() {
        return bookPub;
    }

    public void setBookPub(String bookPub) {
        this.bookPub = bookPub == null ? null : bookPub.trim();
    }

    public Date getBookInTime() {
        return bookInTime;
    }

    public void setBookInTime(Date bookInTime) {
        this.bookInTime = bookInTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public Integer getBookHot() {
        return bookHot;
    }

    public void setBookHot(Integer bookHot) {
        this.bookHot = bookHot;
    }

    public String getBookRem() {
        return bookRem;
    }

    public void setBookRem(String bookRem) {
        this.bookRem = bookRem == null ? null : bookRem.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBookComment() {
        return bookComment;
    }

    public void setBookComment(String bookComment) {
        this.bookComment = bookComment == null ? null : bookComment.trim();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
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
		Book other = (Book) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		long time = bookInTime.getTime();
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookStyle=" + bookStyle + ", bookAuthor="
				+ bookAuthor + ", bookPub=" + bookPub + ", bookInTime=" + time + ", status=" + status
				+ ", imgPath=" + imgPath + ", bookHot=" + bookHot + ", bookRem=" + bookRem + ", price=" + price
				+ ", bookComment=" + bookComment + "]";
	}
    
    
}