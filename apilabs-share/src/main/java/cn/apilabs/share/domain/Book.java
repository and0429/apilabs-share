package cn.apilabs.share.domain;

/**
 * 
 * @author and04
 *
 */
public class Book {

	private Integer id;

	/**
	 * 图片
	 */
	private String imgPath;

	/**
	 * 网盘分享地址
	 */
	private String url;

	/**
	 * 网盘提取码
	 */
	private String extractCode;

	/**
	 * 书名
	 */
	private String name;

	/**
	 * 讲课老师
	 */
	private String author;

	/**
	 * 浏览数量
	 */
	private int count;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getExtractCode() {
		return extractCode;
	}

	public void setExtractCode(String extractCode) {
		this.extractCode = extractCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
