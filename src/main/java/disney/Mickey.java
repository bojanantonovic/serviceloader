package disney;

import disney.spi.DisneyWorldMember;

public class Mickey implements DisneyWorldMember {

	@Override
	public String getName() {
		return "Mickey";
	}
}
