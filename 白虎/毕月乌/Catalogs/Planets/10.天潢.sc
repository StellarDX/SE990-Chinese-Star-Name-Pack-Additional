// Object * 16 Aur  ---  Spectroscopic Binary  ---  OID=@777733   (@@21936,3)  ---  coobox=4458 
// Object types: Double or Multiple Star,Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=24727
Barycenter "16 Aur A"
{
	ParentBody      "16 Aur"
	BinaryOrbit     
	{
		Period          2630
		Separation      439.583606839907 // 4.18 asec
	}
}

Star "16 Aur Aa"
{
	DateUpdated     "2024-07-03"
	ParentBody      "16 Aur A"
	Class           "K2.5IIIbCN-0.5"
	AbsMagn         0.28
	MassSol         1.30
	RadSol          18.8
	LumBol          112
	Teff            4264
	FeH             -0.40
	Age             5.07

	BinaryOrbit // SB9_309 2008Obs...128...21G
	{
		PeriodDays      434.16
		Separation      0.786837792385469 // 7.24 mas
		Eccentricity    0.1189
		Inclination     52.93
		AscendingNode   56.20
		Epoch           2448348.1172
		ArgOfPericenter 250.1
		MeanAnomaly     0
	}
}

Star "16 Aur Ab"
{
	DateUpdated     "2024-07-03"
	ParentBody      "16 Aur A"
	Class           ""
	MassSol         1.37
}

// Object * 16 Aur B  ---  High Proper Motion Star  ---  OID=@15318636   (@@-1,255)  ---  coobox=4458 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "16 Aur B/Gaia DR3 181124410168963840/Gaia DR2 181124410168392960/** STT 103B/ADS 3872 B/CCDM J05182+3322B/WDS J05182+3322B"
{
	DateUpdated     "2024-07-03"
	ParentBody      "16 Aur"
	Class           ""
	MassSol         0.83
}

// Object * 17 Aur  ---  Spectroscopic Binary  ---  OID=@777950   (@@21957,0)  ---  coobox=4458 
// Object types: Eclipsing Binary,Near-IR Source (λ < 3 µm),Eclipsing Binary,Spectroscopic Binary,Variable Star,Star,UV-emission Source 
Barycenter "17 Aur A"
{
	ParentBody      "17 Aur"
	BinaryOrbit     
	{
		Period          23.7
		Separation      13
	}
}

Star "17 Aur Aa"
{
	DateUpdated     "2024-07-03"
	ParentBody      "17 Aur A"
	Class           "B9V"
	AbsMagn         1.11
	MassSol         2.552
	RadSol          1.781
	LumBol          41
	Teff            10950

	BinaryOrbit     
	{
		PeriodDays      4.13
	}
}

Star "17 Aur Ab"
{
	DateUpdated     "2024-07-03"
	ParentBody      "17 Aur A"
	Class           "B9.5V"
	AbsMagn         1.17
	MassSol         2.367
	RadSol          1.816
	LumBol          34
	Teff            10350
}

Star "17 Aur B"
{
	DateUpdated     "2024-07-03"
	ParentBody      "17 Aur"
	Class           ""
	MassSol         0.54
}