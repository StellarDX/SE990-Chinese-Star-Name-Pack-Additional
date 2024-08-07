// Object * 6 Dra  ---  Spectroscopic Binary  ---  OID=@447231   (@@5941,5)  ---  coobox=1782 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source 
Star "6 Dra A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "6 Dra"
	Class           "K2.5IIIFe-2"
	AbsMagn         -1.35
	MassKg          1.48950952444953e+31 // log(g) = 2.2 cm/s^2
	RadSol          36
	LumBol          602.72
	Teff            4210
	FeH             -0.21

	BinaryOrbit
	{
		PeriodDays      561.7
		Asini           0.34
		Eccentricity    0.262
		Epoch           2445525
		ArgOfPericenter 189
		MeanAnomaly     0
	}
}

Star "6 Dra B"
{
	ParentBody      "6 Dra"
	Class           "A8-9V"
}

// Object * 4 Dra  ---  Spectroscopic Binary  ---  OID=@447218   (@@5635,4)  ---  coobox=1782 
// Object types: Double or Multiple Star,Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Double or Multiple Star,Star,Infra-Red Source,Long-Period Variable Candidate,X-ray Source 
Star "4 Dra A"
{
	DateUpdated     "2024-04-28"
	ParentBody      "4 Dra"
	Class           "M3IIIa"
	AbsMagn         -1.37
	MassSol         4.8
	RadSol          134
	LumBol          4074
	Teff            3500

	BinaryOrbit
	{
		PeriodDays      1703
		Asini           0.54813614402601253067166817635727
		Eccentricity    0.30
		Epoch           2442868.5
		ArgOfPericenter 64
		MeanAnomaly     0
	}
}

Star "4 Dra B"
{
	ParentBody      "4 Dra"
	Class           "WD"
	MassSol         0.8
	Teff            20000
}

// Object HD 42818  ---  High Proper Motion Star  ---  OID=@333895   (@@2772,11)  ---  coobox=3241 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "HD 42818 A"
{
	DateUpdated     "2024-04-28"
	ParentBody      "HD 42818"
	Class           "A0Vn"
	AbsMagn         +1.11
	MassSol         2.49
	RadSol          2.7
	LumBol          33.83
	Teff            10834
	FeH             0.3
	Age             0.099

	BinaryOrbit // 程序生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.209706516
		Eccentricity    0.633327629
		Inclination     -0.349334717
		AscendingNode   0
		ArgOfPericenter -121.17527
		MeanAnomaly     -20.4236801
	}
}

Star "HD 42818 B"
{
	ParentBody      "HD 42818"
	Class           "F9.9?" // 温度比主星低
}

// Object HD 23089  ---  Double or Multiple Star  ---  OID=@256462   (@@2374,0)  ---  coobox=2832 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "HD 23089 A"
{
	DateUpdated     "2024-04-28"
	ParentBody      "HIP 17587"
	Class           "G2Ib/II"
	AbsMagn         -2.70
	MassSol         5.0
	RadSol          41
	LumBol          1150
	Teff            5250
	FeH             -0.28

	BinaryOrbit
	{
		PeriodDays      6124
		Eccentricity    0.678
		Inclination     87
		Epoch           2445850
		ArgOfPericenter 316.5
		MeanAnomaly     0
	}
}

Star "HD 23089 B"
{
	DateUpdated     "2024-04-28"
	ParentBody      "HIP 17587"
	Class           "B7III/IV"
	AbsMagn         -1.50
	MassSol         4.5
	RadSol          5.3
	LumBol          708
	Teff            13000
}