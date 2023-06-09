CREATE TABLE TEST_MESSAGES (
   id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
   text                   VARCHAR      NOT NULL
   );



   CREATE TABLE USER_INFO (
      userId                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
      extId                      VARCHAR(100),
      firstname                  VARCHAR(100),
      lastname                  VARCHAR(100),

      metadata                   VARCHAR(1000)

     );






   CREATE TABLE RESOURCE (
    resourceId                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
    name                      VARCHAR(100),
    type                  VARCHAR(100),
    defaultaccess                  VARCHAR(100),
    status                    VARCHAR(60),
    metadata                   VARCHAR(1000)


   );






INSERT INTO USER_INFO (userId, extId,firstname, lastname, metadata) VALUES ('user1', '1081901','Adam', 'Admin', '[{"role":"Facility-admin", "facilityId":"1234567", "facilityName":"St.Jude senior living", "type":"MPIN", "market":"MN"}]');
INSERT INTO USER_INFO (userId, extId,firstname, lastname, metadata) VALUES ('user2', '0071001','Katrina', 'User','[{"role":"Facility-user", "facilityId":"1234567", "facilityName":"St.Jude senior living", "type":"MPIN", "market":"MN"}]');


INSERT INTO Resource  (resourceId, name, type, defaultaccess, status) VALUES ('r1', 'ADMIN_PORTAL', 'APP', 'private', 'active');
INSERT INTO Resource (resourceId, name, type, defaultaccess, status) VALUES ('r2', 'FACILITY_PORTAL', 'APP', 'public', 'active');
INSERT INTO Resource (resourceId, name, type, defaultaccess, status) VALUES ('r3', 'PHYSICAN_PORTAL', 'APP', 'public', 'active');

INSERT INTO Resource (resourceId, name, type, defaultaccess, status) VALUES ('r4', 'app-contracts', 'FACILITY_MENU', 'public', 'active');
INSERT INTO Resource (resourceId, name, type, defaultaccess, status) VALUES ('r5', 'app-reports', 'FACILITY_MENU', 'private', 'active');
INSERT INTO Resource (resourceId, name, type, defaultaccess, status) VALUES ('r6', 'app-education', 'FACILITY_MENU', 'public', 'active');
INSERT INTO Resource (resourceId, name, type, defaultaccess, status) VALUES ('r7', 'app-chatbot', 'FACILITY_MENU', 'public', 'active');
INSERT INTO Resource (resourceId, name, type, defaultaccess, status) VALUES ('r8', 'facilitybinder', 'FACILITY_EDUCATION', 'public', 'active');
INSERT INTO Resource (resourceId, name, type, defaultaccess, status) VALUES ('r9', 'optum101', 'FACILITY_EDUCATION', 'public', 'active');

UPDATE Resource  SET metadata = '[{"docName":"Introduction to Optum", "docUrl": "https://www.africau.edu/images/default/sample.pdf", "docDescription":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus imperdiet, nulla et dictum interdum, nisi lorem egestas odio, vitae scelerisque enim ligula venenatis dolor."}]'  WHERE resourceId = 'r9';
UPDATE Resource  SET metadata = '[{"docName":One pager 1", "docUrl": "https://www.africau.edu/images/default/sample.pdf", "docDescription":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus imperdiet, nulla et dictum interdum, nisi lorem egestas odio, vitae scelerisque enim ligula venenatis dolor."},{"docName":One pager 2", "docUrl": "https://www.africau.edu/images/default/sample.pdf", "docDescription":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus imperdiet, nulla et dictum interdum, nisi lorem egestas odio, vitae scelerisque enim ligula venenatis dolor."}]'  WHERE resourceId = 'r8';




