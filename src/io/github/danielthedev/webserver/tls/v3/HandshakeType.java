package io.github.danielthedev.webserver.tls.v3;

public enum HandshakeType {

	CLIENT_HELLO(1), SERVER_HELLO(2), NEW_SESSION_TICKET(4), END_OF_EARLY_DATA(5), ENCRYPTED_EXTENSIONS(8),
	CERTIFICATE(11), CERTIFICATE_REQUEST(13), CERTIFICATE_VERIFY(15), FINISHED(20), KEY_UPDATE(24), MESSAGE_HASH(254);

	private final int id;

	HandshakeType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
