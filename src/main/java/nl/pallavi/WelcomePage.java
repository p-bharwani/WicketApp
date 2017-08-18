package nl.pallavi;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

public class WelcomePage extends WebPage {
	public WelcomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("lbl", new Model<String>("New page!")));

		// TODO Add your page's components here
		
		final TextField<String> username = new TextField<String>("username", Model.of(""));
		//username.setRequired(true);
		//username.add(new UserNameValidator());
		

    }
}
