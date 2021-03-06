package top.hoyouly.framework.bean;

/**
 * Created by hoyouly on 18/3/25.
 */

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import top.hoyouly.framework.BR;

/**
 * Created by Phil on 2017/8/17.
 */

public class User extends BaseObservable {
	private String id;
	private String name;
	private String blog;

	public User() {

	}

	public User(String id, String name, String blog) {
		this.id = id;
		this.name = name;
		this.blog = blog;
	}

	public void setId(String id) {
		this.id = id;
		notifyPropertyChanged(BR.id);
	}

	@Bindable
	public String getId() {
		return this.id;
	}


	public void setName(String name) {
		this.name = name;
		notifyPropertyChanged(BR.name);
	}

	@Bindable
	public String getName() {
		return this.name;
	}

	public void setBlog(String blog) {
		this.blog = blog;
		notifyPropertyChanged(BR.blog);
	}

	@Bindable
	public String getBlog() {
		return this.blog;
	}
}
