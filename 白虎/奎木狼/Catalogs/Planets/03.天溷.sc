// Object * 13 Cet  ---  RS CVn Variable  ---  OID=@1355918   (@@28021,0)  ---  coobox=10617 
// Object types: Double or Multiple Star,Double or Multiple Star,Double or Multiple Star,High Proper Motion Star,Spectroscopic Binary,Variable Star,RS CVn Variable,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=2762
Remove "13 Cet A"{ParentBody "13 Cet"}
Remove "13 Cet B"{ParentBody "13 Cet"}
Remove "13 Cet Aa"{ParentBody "13 Cet A"}
Remove "13 Cet Ab"{ParentBody "13 Cet A"}
Barycenter "13 Cet A"
{
	ParentBody      "GJ 23"
	BinaryOrbit // VB6_Msn2005 HO_212AB Gr.1
	{
		Period          6.8900
		Separation      5.12200581080458 // 0.241 asec
		Eccentricity    0.773
		Inclination     49.4
		AscendingNode   149.0
		Epoch           2451902.470752905588597
		ArgOfPericenter 283.8
		MeanAnomaly     0
	}
}

Star "13 Cet A1"
{
	DateUpdated     "2024-06-20"
	ParentBody      "13 Cet"
	Class           "F7V"
	AbsMagn         3.56
	MassSol         1.18
	Radius          901553.420956224 // 计算的值
	LumBol          2.63
	Teff            6457
	Age             3.8

	BinaryOrbit // SB9_27 1991A&A...248..485D
	{
		PeriodDays      2.081891
		Eccentricity    0.0
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2443400.4573
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "13 Cet A2"
{
	DateUpdated     "2024-06-20"
	ParentBody      "13 Cet"
	Class           "K3.5V"
	MassSol         0.7
}

Star "13 Cet B"
{
	DateUpdated     "2024-06-20"
	ParentBody      "GJ 23"
	Class           "G4V"
	MassSol         0.90
	Radius          637785.28548979 // 计算的值
	LumBol          0.83
	Teff            5754
	Age             2.5
}
