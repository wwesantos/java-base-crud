CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
DROP TABLE IF EXISTS quote;

CREATE TABLE IF NOT EXISTS quote (
    quote_id uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    body jsonb not null
    ) WITH (
        OIDS = false
);

INSERT INTO  quote (quote_id, body) VALUES ('a5c19c42-cac5-4901-b6ce-b95181465420', '
{
  "id": "a5c19c42-cac5-4901-b6ce-b95181465420",
  "version": "1",
  "customerId": "123456689",
  "quoteItem": [
    {
      "id": "f8bf83f8-fc42-4443-aa48-f465d7ae3c14",
      "quantity": 1,
      "productOffering": {
        "id": "1",
        "name": "High Speed Internet"
      },
      "quoteItemPrice": [
        {
          "priceType": "RC",
          "price": {
            "taxIncludedAmount": "10.00"
          },
          "priceCurrency": "BRL"
        }
      ]
    },
    {
        "id": "eded8143-8629-4935-9a69-0d40b97f0271",
        "quantity": 1,
        "productOffering": {
          "id": "2",
          "name": "Low Speed Internet"
        },
        "quoteItemPrice": [
          {
            "priceType": "RC",
            "price": {
              "taxIncludedAmount": "15.00"
            },
            "priceCurrency": "BRL"
          }
        ]
      }
    ]
}
');

INSERT INTO  quote (quote_id, body) VALUES ('671afeea-f174-4dd6-8925-883829657943', '
{
  "id": "671afeea-f174-4dd6-8925-883829657943",
  "version": "10",
  "customerId": "123456680",
  "quoteItem": [
    {
      "id": "f8bf83f8-fc42-4443-aa48-f465d7ae3c14",
      "quantity": 1,
      "productOffering": {
        "id": "1",
        "name": "High Speed Internet"
      },
      "quoteItemPrice": [
        {
          "priceType": "RC",
          "price": {
            "taxIncludedAmount": "10.00"
          },
          "priceCurrency": "BRL"
        }
      ]
    },
    {
        "id": "eded8143-8629-4935-9a69-0d40b97f0271",
        "quantity": 1,
        "productOffering": {
          "id": "2",
          "name": "Low Speed Internet"
        },
        "quoteItemPrice": [
          {
            "priceType": "RC",
            "price": {
              "taxIncludedAmount": "15.00"
            },
            "priceCurrency": "BRL"
          }
        ]
      }
    ]
}
');

INSERT INTO  quote (quote_id, body) VALUES ('5dc1308d-3ecc-49c2-9598-4106437f95d5', '
{
  "id": "5dc1308d-3ecc-49c2-9598-4106437f95d5",
  "version": "50",
  "customerId": "123456681",
  "quoteItem": [
    {
      "id": "f8bf83f8-fc42-4443-aa48-f465d7ae3c14",
      "quantity": 1,
      "productOffering": {
        "id": "1",
        "name": "High Speed Internet"
      },
      "quoteItemPrice": [
        {
          "priceType": "RC",
          "price": {
            "taxIncludedAmount": "10.00"
          },
          "priceCurrency": "BRL"
        }
      ]
    },
    {
        "id": "eded8143-8629-4935-9a69-0d40b97f0271",
        "quantity": 1,
        "productOffering": {
          "id": "2",
          "name": "Low Speed Internet"
        },
        "quoteItemPrice": [
          {
            "priceType": "RC",
            "price": {
              "taxIncludedAmount": "15.00"
            },
            "priceCurrency": "BRL"
          }
        ]
      }
    ]
}
');
