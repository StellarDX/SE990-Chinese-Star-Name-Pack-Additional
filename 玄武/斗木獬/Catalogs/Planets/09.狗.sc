// Object * h01 Sgr  ---  delta Sct Variable  ---  OID=@2505943   (@@59939,4)  ---  coobox=19026 
// Object types: delta Sct Variable,delta Sct Variable,delta Sct Variable,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,UV-emission Source 
Star "51 Sgr A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "51 Sgr"
	Class           "A1mA2-F0"
	AbsMagn         1.09 // 计算的值
	MassKg          3.64127997119158e+30 // log(g) = 3.815 cm/s^2
	RadSol          2.772732 // Gaia DR3
	LumBol          29.4496129643621 // 计算的值
	Teff            8075
	FeH             -0.398

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   52.5604323
		Eccentricity    0.604747257
		Inclination     -0.575248957
		AscendingNode   0
		ArgOfPericenter -112.815006
		MeanAnomaly     39.3150972
	}
}

Star "51 Sgr B"
{
	ParentBody      "51 Sgr"
	Class           "F1.1?"
}

// Object * 53 Sgr  ---  Double or Multiple Star  ---  OID=@2505926   (@@59486,7)  ---  coobox=19027 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "53 Sgr A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "53 Sgr"
	Class           "A0V"
	AbsMagn         0.74 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.993084
		Eccentricity    0.55148359
		Inclination     0.559952021
		AscendingNode   0
		ArgOfPericenter -123.547325
		MeanAnomaly     87.0906664
	}
}

Star "53 Sgr B"
{
	ParentBody      "53 Sgr"
	Class           "G2.9?"
}

// Object * psi Sgr  ---  Spectroscopic Binary  ---  OID=@2504709   (@@58999,0)  ---  coobox=18675 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=94643
Star "PSI Sgr A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "PSI Sgr"
	Class           "K2III"
	AbsMagn         0.06
	MassSol         2.10
	LumBol          84
}

Barycenter "PSI Sgr B"
{
	ParentBody      "PSI Sgr"
	BinaryOrbit // VB6_Tok2015c B_430 Gr.2
	{
		Period          19.9500
		Separation      12.3723831647267 // 0.132 asec
		Eccentricity    0.506
		Inclination     82.1
		AscendingNode   285.1
		Epoch           2457015.861535839270800
		ArgOfPericenter 7.5
		MeanAnomaly     0
	}
}

Star "PSI Sgr Ba"
{
	DateUpdated     "2024-06-02"
	ParentBody      "PSI Sgr B"
	Class           "A9III"
	MassSol         2.70

	BinaryOrbit // SB9_1134 1975AJ.....80..844F
	{
		PeriodDays      10.7786
		Eccentricity    0.470
		Inclination     74.5
		AscendingNode   0.0
		Epoch           2442226.012
		ArgOfPericenter 1.5
		MeanAnomaly     0
	}
}

Star "PSI Sgr Bb"
{
	DateUpdated     "2024-06-02"
	ParentBody      "PSI Sgr B"
	Class           "A3V"
	MassSol         1.70
}