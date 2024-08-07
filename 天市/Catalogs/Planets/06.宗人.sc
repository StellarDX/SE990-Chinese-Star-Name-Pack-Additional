// Object * 72 Oph  ---  High Proper Motion Star  ---  OID=@2701272   (@@55215,7)  ---  coobox=19478 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "72 Oph A" {ParentBody "72 Oph"}
Remove "72 Oph B" {ParentBody "72 Oph"}
Star "72 Oph A"
{
	DateUpdated     "2024-05-16"
	ParentBody      "HIP 88771"
	Class           "A5V"
	AbsMagn         1.58
	MassSol         1.99
	RadSol          1.9
	LumBol          20
	Teff            8718
	FeH             0.09
	Age             0.250

	BinaryOrbit     
	{
		Separation      655.715344305589 // 25 asec
	}
}

Star "72 Oph B"
{
	ParentBody      "HIP 88771"
	Class           "F3.5?"
}

// Object * 73 Oph A  ---  Star  ---  OID=@9642843   (@@-1,255)  ---  coobox=19462 
// Object types: Double or Multiple Star,Star 
Star "73 Oph A/** STF 2281A/ADS 11111 A/BD+03 3610A/CCDM J18096+0359A/HD 166233A/TYC 439-1445-1/WDS J18096+0400A"
{
	DateUpdated     "2024-05-16"
	ParentBody      "73 Oph"
	Class           "F3V"
	AbsMagn         2.36 // 计算的值

	BinaryOrbit     
	{
		Separation      21.3699263326852 // 0.39 asec
	}
}

// Object * 73 Oph B  ---  Star  ---  OID=@2670165   (@@55252,16)  ---  coobox=19462 
// Object types: Double or Multiple Star,Star 
Star "73 Oph B/ADS 11111 B/WDS J18096+0400B/** STF 2281B/BD+03 3610B/CCDM J18096+0359B/HD 166233B/TYC 439-1445-2"
{
	ParentBody      "73 Oph"
	Class           "F7.3?"
}

