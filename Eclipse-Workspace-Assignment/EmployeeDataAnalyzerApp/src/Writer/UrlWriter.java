package Writer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class UrlWriter implements IWriter {
	private Set<String> sets;

	public UrlWriter(URL url) throws IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
		sets = new HashSet<String>();
		String i;
		while ((i = read.readLine()) != null) {
			sets.add(i);
		}
		read.close();
	}

	@Override
	public Set<String> getSet() {
		// TODO Auto-generated method stub
		return sets;
	}
}
