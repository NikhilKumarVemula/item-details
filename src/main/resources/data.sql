DROP TABLE IF EXISTS Test;
DROP TABLE IF EXISTS BILLIONAIRES;
DROP TABLE IF EXISTS category;

CREATE TABLE category (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  category_code VARCHAR(250) NOT NULL,
  category_name VARCHAR(250) NOT NULL,
  description VARCHAR(250)
);

INSERT INTO category (category_code, category_name, description) VALUES
  ('FJ', 'Fastening & Joining', 'Fastening & Joining'),
  ('HT', 'Hand Tools', 'Hand Tools'),
  ('PJ', 'Plumbing & Janitorial', 'Plumbing & Janitorial'),
  ('LUB', 'Lubricating', 'Lubricating'),
  ('AP', 'Abrading & Polishing', 'Abrading & Polishing'),
  ('BG', 'Building & Grounds', 'Building & Grounds'),
  ('EL', 'Electrical & Lighting', 'Electrical & Lighting'),
  ('FAB', 'Fabricating', 'Fabricating'),
  ('FIL', 'Filtering', 'Filtering'),
  ('SEL', 'Sealing', 'Sealing'),
  ('SUS', 'Suspending', 'Suspending'),
  ('PL', 'Pulling & Lifting', 'Pulling & Lifting');
