Sample POST request body

```json
{
    "survey": {
        "name": "Test Survey",
        "description": "Test survey for testing POST requests"
    },
    "questions": [
        {   
            "qid": 1,
            "value": "In the last 4 weeks, how true for you are the following statements?"
        }
    ],
    "subQuestions": [
        {
            "qid": 1,
            "sid": "A",
            "value": "My energy level during the day is less than usual"
        },
        {
            "qid": 1,
            "sid": "B",
            "value": "I feel very tired or fatigued"
        },
        {
            "qid": 1,
            "sid": "C",
            "value": "My activity is limited"
        }
    ]
}
```

To fetch a specific survey with questions
`<server>:<port>/api/v1/survey/{id}`