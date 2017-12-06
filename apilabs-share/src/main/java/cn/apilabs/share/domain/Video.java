package cn.apilabs.share.domain;

/**
 * 
 * @author and04
 *
 */
public class Video {

	private Integer id;
	private String imgPath;

	/**
	 * 网盘分享地址
	 */
	private String url;
	private String title;
	private String description;
	private int count;

	/**
	 * 网盘提取码
	 */
	private String extractCode;

	/**
	 * 机构
	 */
	private String mechanism;

	/**
	 * 讲课老师
	 */
	private String teacher;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getExtractCode() {
		return extractCode;
	}

	public void setExtractCode(String extractCode) {
		this.extractCode = extractCode;
	}

	public String getMechanism() {
		return mechanism;
	}

	public void setMechanism(String mechanism) {
		this.mechanism = mechanism;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}
