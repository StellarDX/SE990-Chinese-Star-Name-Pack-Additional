// Object * b Eri  ---  Double or Multiple Star  ---  OID=@748458   (@@16329,7)  ---  coobox=6426 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Barycenter "62 Eri A"
{
	ParentBody      "62 Eri"
	BinaryOrbit     
	{
		Period          589869
		Separation      14647.8872658866 // 66.56 asec
	}
}

Star "62 Eri Aa"
{
	DateUpdated     "2024-07-04"
	ParentBody      "62 Eri A"
	Class           "B5III"
	AbsMagn         -1.23 // 计算的值
	MassSol         5.69
	RadSol          4.175 // Gaia DR3
	LumBol          686.562074973638 // 计算的值
	Teff            14460
	FeH             -1.357

	BinaryOrbit     
	{
		Period          632.594
		Separation      141.945188815625 // 0.645 asec
	}
}

Star "62 Eri Ab"
{
	DateUpdated     "2024-07-04"
	ParentBody      "62 Eri A"
	Class           ""
	MassSol         1.46
}

// Object BD-05 1093  ---  Star  ---  OID=@748460   (@@16329,9)  ---  coobox=6426 
// Object types: Double or Multiple Star,Star 
Star "BD-05 1093/Gaia DR3 3212297162705983104/BDS 2432 B/CCDM J04564-0510B/GPM 74.118723-05.166608/IDS 04515-0520 B/PPM 187490/SAO 131617/TYC 4745-1842-1/YZ 95 1327/Pul -3 310066/WDS J04564-0510B/** SHJ 48B/RAVE J045628.5-051000/Gaia DR2 3212297162705983104"
{
	DateUpdated     "2024-07-04"
	ParentBody      "62 Eri"
	Parallax        4.3031
	AppMagn         9.2
	Class           "A8"
	AbsMagn         2.37 // 计算的值
	MassSol         1.70
}

// Object * l Eri A  ---  High Proper Motion Star  ---  OID=@725550   (@@14939,25)  ---  coobox=6537 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "l Eri A/GJ 9160 A/WDS J04382-1418A/HD 29503A/BD-14 933A/** KUI 18A/53 Eri A/CCDM J04382-1418A/TYC 5327-1434-1"
{
	DateUpdated     "2024-07-04"
	ParentBody      "53 Eri"
	Class           "K2IIIb"
	AbsMagn         1.17
	MassSol         1.07
	RadSol          9.8
	LumBol          37
	Teff            4603
	FeH             -4603

	BinaryOrbit     
	{
		Period          77.4
		Separation      24.4798565794458 // 0.7069 asec
		Eccentricity    0.666
		Inclination     59.8
		AscendingNode   171.25
		Epoch           2443059.957120417151600
		ArgOfPericenter 203.5
		MeanAnomaly     0
	}
}

// Object * l Eri B  ---  High Proper Motion Star  ---  OID=@725551   (@@14939,26)  ---  coobox=6537 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "l Eri B/GJ 9160 B/WDS J04382-1418B/BD-14 933B/53 Eri B/** KUI 18B/CCDM J04382-1418B/HD 29503B/TYC 5327-1434-2"
{
	DateUpdated     "2024-07-04"
	ParentBody      "53 Eri"
	Class           ""
	MassSol         1.42 // Total. 2.49 MSun
}
