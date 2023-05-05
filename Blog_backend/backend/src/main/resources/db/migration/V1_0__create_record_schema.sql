CREATE TABLE RECORD (
	ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
	CREATED_BY CHARACTER VARYING(255),
	CREATED_DATE TIMESTAMP,
	DESCRIPTION CHARACTER VARYING(255),
	MODIFIED_BY CHARACTER VARYING(255),
	MODIFIED_DATE TIMESTAMP,
	NAME CHARACTER VARYING(30),

	CONSTRAINT RECORD_PK PRIMARY KEY (ID)
)