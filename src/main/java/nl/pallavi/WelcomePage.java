package nl.pallavi;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class WelcomePage extends WebPage {
	public WelcomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("lbl", new Model<String>("New page!")));

		// TODO Add your page's components here

    }
}
